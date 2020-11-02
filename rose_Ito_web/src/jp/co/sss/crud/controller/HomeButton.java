package jp.co.sss.crud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.sss.crud.model.beans.RoseBeans;
import jp.co.sss.crud.model.daos.RoseDao;

/**
 * Servlet implementation class HomeButton
 */
@WebServlet(description = "ホームボタン押下時", urlPatterns = { "/HomeButton" })
public class HomeButton extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		RoseBeans rb = RoseDao.selectAll();
		request.setAttribute("roseAll", rb);
		request.getRequestDispatcher("/images/product.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
