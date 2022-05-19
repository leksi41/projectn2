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

@WebServlet(name="AdsServlet", urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {

    AdsDao adsDao;

    public AdsServlet(){
        this.adsDao = new AdsDaoImpl();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        List<Ads> ads = adsDao.getAllAds();
        req.setAttribute("ads",ads);
        RequestDispatcher dispatcher = req.getRequestDispatcher("ads.jsp");
        dispatcher.forward(req,resp);

    }


}
