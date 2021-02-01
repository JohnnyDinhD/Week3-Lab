package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 792268
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstnum = request.getParameter("firstnum");
        request.setAttribute("firstnum", firstnum);
        
        String secondnum = request.getParameter("secondnum");
        request.setAttribute("secondnum", secondnum);
        
        String plus = request.getParameter("plus");
        request.setAttribute("plus", plus);
        
         String minus = request.getParameter("minus");
        request.setAttribute("minus", minus);

        String multiply = request.getParameter("multiply");
        request.setAttribute("multiply", multiply);

        String modulus = request.getParameter("modulus");
        request.setAttribute("modulus", modulus);

        //Tried if and else if statements
        if (firstnum == null || firstnum.equals("") || secondnum == null || secondnum.equals("")) {
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        } else if (firstnum != null || firstnum == "plus" || secondnum != null || secondnum == "plus") {
            request.getParameter("plus");
            request.setAttribute("message", Integer.parseInt(firstnum) + Integer.parseInt(secondnum));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        } else if (firstnum != null || firstnum == "minus" || secondnum != null || secondnum == "minus") {
            request.getParameter("minus");
            request.setAttribute("message", Integer.parseInt(firstnum) + Integer.parseInt(secondnum));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);

        } else if (firstnum != null || firstnum == "multiply" || secondnum != null || secondnum == "multiply") {
            request.getParameter("multiply");
            request.setAttribute("message", Integer.parseInt(firstnum) + Integer.parseInt(secondnum));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);

        } else if (firstnum != null || firstnum == "modulus" || secondnum != null || secondnum == "modulus") {
            request.getParameter("modulus");
            request.setAttribute("message", Integer.parseInt(firstnum) + Integer.parseInt(secondnum));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        }
    }
}
