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
        
        //String nocalcstring = request.getParameter("nocalcstring");
        //request.setAttribute("nocalcstring", "---");
        
        //Invalid Message         
        if (firstnum == null || firstnum.equals("") || secondnum == null || secondnum.equals("")) {
            request.setAttribute("invalidmsg", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            }
        
        //Addition Calculation
        else if (firstnum != null || secondnum != null) {
            request.setAttribute("add", Integer.parseInt(firstnum) + Integer.parseInt(secondnum));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        }
   
        //Subtraction Calculation
        if (firstnum.equals("add") || secondnum.equals("add")) {
            request.setAttribute("minus", Integer.parseInt(firstnum) - Integer.parseInt(secondnum));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        }

        
        return;
        }

    }
