package commaSeparated;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Unique
 */
public class Unique extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Unique() {
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
		
		int c=0;
		for(int i=0;i<num1.length-1;i++)
		{
			c=0;
			if(num1[i]!=-1)
			{
			for(int j=i+1;j<num1.length;j++)
			{
				if(num1[i]==num1[j])
				{
					c++;
					num1[j]=-1;
				}
			}
			}
			if(c==0)
			{
				pw.println(num1[i]+" is Unique");
			}
		}
		
	}

}
