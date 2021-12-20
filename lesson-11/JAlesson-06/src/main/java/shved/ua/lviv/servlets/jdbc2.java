package shved.ua.lviv.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shved.ua.lviv.utils.ConnectionUtil;

@WebServlet("/jdbc2")
public class jdbc2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ResultSet resultSet = null;
	String query = null;
	public static Statement st;

	private Connection connection;
	private PreparedStatement preparedStatement;
	
	public jdbc2() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		connection = ConnectionUtil.openConnection();
		}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		query = "select * from product";
		try {
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			out.println("<html><body><h2>The Select query has following results : </h2>");
			out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
			out.println("<tr>");
			out.println("<td><b>ID</b></td>");
			out.println("<td><b>Name</b></td>");
			out.println("<td><b>Description</b></td>");
			out.println("<td><b>Price</b></td>");
			out.println("<td><b>Link to Your book</b></td>");

			out.println("</tr>");
			

			while (resultSet.next()) {
				out.println("<tr>");
				out.println("<td>" + resultSet.getInt(1) + "</td>");
				out.println("<td>" + resultSet.getString(2) + "</td>");
				out.println("<td>" + resultSet.getString(3) + "</td>");
				out.println("<td>" + resultSet.getDouble(4) + "</td>");
				out.println("<td>" + resultSet.getString(5) + "</td>");

				out.println("</tr>");

			}
			out.println("</table></br><hr></body></html>");
			out.println("<a href=\"index.jsp\" >Go to main page</a>");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
