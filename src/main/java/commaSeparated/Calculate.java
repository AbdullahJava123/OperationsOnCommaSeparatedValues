package commaSeparated;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Calculate
 */
public class Calculate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//String num=request.getParameter("num");
		String button=request.getParameter("calculate");
		switch(button)
		{
		case "pDup": RequestDispatcher rd=request.getRequestDispatcher("dup");
		               rd.forward(request, response);
		               break;
		case "sortnum": RequestDispatcher rd1=request.getRequestDispatcher("sort");
		                rd1.forward(request, response);
			            break;
		case "findMax": RequestDispatcher rd2=request.getRequestDispatcher("max");
                         rd2.forward(request, response);
			            break;
		case "unique": RequestDispatcher rd3=request.getRequestDispatcher("unique");
		                rd3.forward(request, response);
			           break;
		}
//String num=request.getParameter("num");
//		String[] arr=num.split(",");
//		int[] num1=new int[arr.length];
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			num1[i]=Integer.parseInt(arr[i].trim());
//		}
	
	}

}
