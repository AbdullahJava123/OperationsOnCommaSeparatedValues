package commaSeparated;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Servlet implementation class Maximum
 */
public class Maximum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Maximum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw=response.getWriter();
		String num=request.getParameter("num");
		String[] arr=num.split(",");
		
		int[] num1=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			num1[i]=Integer.parseInt(arr[i].trim());
		}
		int max=0;
		for(int i=0;i<num1.length;i++)
		{
			if(max<num1[i])
			{
				max=num1[i];
			}
		}
		pw.println(Arrays.toString(num1)+" Max number is: "+max);
	}

}
