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
             
        if (firstnum == null || firstnum.equals("") || secondnum == null || secondnum.equals("")) {
            request.setAttribute("nocalc", "---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        }
        
        if (firstnum == null || firstnum.equals("") || secondnum == null || secondnum.equals("")) {
            request.setAttribute("invalidmsg", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            }
        
        return;
        }

    }
