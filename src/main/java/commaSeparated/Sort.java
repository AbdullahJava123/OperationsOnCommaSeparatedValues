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
 * Servlet implementation class Sort
 */
public class Sort extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sort() {
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
		
		for(int i=0;i<num1.length-1;i++)
		{
			for(int j=i+1;j<num1.length;j++)
			{
				if(num1[i]>num1[j])
				{
					int t=num1[i];
					num1[i]=num1[j];
					num1[j]=t;
				}
			}
		}
		pw.println(Arrays.toString(num1));
	}

}