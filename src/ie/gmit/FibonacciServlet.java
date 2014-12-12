package ie.gmit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FibonacciServlet
 */
@WebServlet("/FibonacciServlet")
public class FibonacciServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Fibonacci fib = new Fibonacci();
    Fibonacci id = new Fibonacci();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FibonacciServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int max = Integer.parseInt(request.getParameter("max"));
		String jobId = (request.getParameter("jobId"));		
		request.setAttribute("series", fib.getFibonacciSequence(max));
		request.setAttribute("jobId", id.getUniqueId(jobId));		
		request.getRequestDispatcher("Results.jsp").forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
