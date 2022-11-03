package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.FeeManagementPage;
import Pages.HomePage1;
import Pages.LoginClass;

public class feeManagementSuperAdminTest extends BaseTest {
	LoginClass LC;

	HomePage1 HP;

	FeeManagementPage FM;

	public feeManagementSuperAdminTest() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();

		FM = new FeeManagementPage();

		LC = new LoginClass();

		HP = LC.newLogin(prop.getProperty("username"), prop.getProperty("password"));

	}
	@BeforeMethod
	public void refresh() 
	{
		WaitTil(2000);
		driver.navigate().refresh();
		WaitTil(2000);
	}

	@Test(priority = 1)
	public void Overview() throws InterruptedException {
		System.out.println("--------The test case 1 was started------- ");
		WaitTil(2000);
		FM.validateFeemanagementPage();
		WaitTil(2000);
		System.out.println("--------The test case 1 was started------- ");
		
	}

	/*@Test(priority = 2)
	public void GenerateOnlineRequest() throws InterruptedException {
		System.out.println("--------The test case 2 was started------- ");
		WaitTil(2000);
		FM.GeneratePaymentRequest();
		WaitTil(2000);
		FM.PaymentRequestForClass();

	}*/

	/*@Test(priority = 3)
	public void AddOfflinePaymnet() throws InterruptedException {
		System.out.println("--------The test case 3 was started------- ");
		WaitTil(2000);
		FM.AddAllOfflinePaymnets();

	}*/

	/*@Test(priority = 6)
	public void Transaction() throws InterruptedException {
		System.out.println("--------The test case 6 was started------- ");
		Thread.sleep(2000);
		FM.Transaction();
	}*/

	/*@Test(priority = 7)
	public void AllStudents() throws InterruptedException {
		System.out.println("--------The test case 7 was started------- ");
		Thread.sleep(2000);
		FM.studentAll();

	}

	@Test(priority = 8)
	public void RecentActivityLogs() throws InterruptedException {

		System.out.println("--------The test case 8 was started------- ");
			WaitTil(3000);
			FM.recentActivity();
		
	}*/

	
	@AfterSuite
	public void taerDown() {
		driver.quit();
	}
}
