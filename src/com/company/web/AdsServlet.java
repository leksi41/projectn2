package com.company.web;

import com.company.dao.AdsDao;
import com.company.dao.AdsDaoImpl;
import com.company.model.Ads;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdsServlet", urlPatterns = {"/ads", "/ads-new", "/ads-add"})
public class AdsServlet extends HttpServlet {

    AdsDao adsDao;

    public AdsServlet() {
        this.adsDao = new AdsDaoImpl();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        switch (req.getServletPath()) {
            case "/ads":
                getAllAds(req, resp);
                break;
            case "/ads-new":
                showAdsForm(req, resp);
                break;
            case "/ads-add":
                addAds(req, resp);
                break;
        }
    }

    private void showAdsForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("Ads-form.jsp");
        dispatcher.forward(req, resp);
    }

    private void addAds(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.adsDao.insert(Ads.builder()
                .title(req.getParameter("title"))
                .subtitle(req.getParameter("subtitle"))
                .description(req.getParameter("description"))
                .price(Double.parseDouble(req.getParameter("price")))
                .build());
        resp.sendRedirect(req.getContextPath() + "/ads");
    }

    private void getAllAds(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Ads> ads = adsDao.getAllAds();
        req.setAttribute("ads", ads);
        RequestDispatcher dispatcher = req.getRequestDispatcher("ads.jsp");
        dispatcher.forward(req, resp);
    }


}
