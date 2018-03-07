package DataProvider;

import org.testng.annotations.Test;

public class testDP {
	
	@Test(dataProvider="GoIbibo",dataProviderClass=MyDataProviders.class)
	public void test(String src,String dest,String adult,String child,String cls) throws Exception{
		
		System.out.println("GetData: "+src+" - "+dest+" - "+adult+" - "+child+" - "+cls);
		
	}

}
