package testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test(groups="ram",priority=3)
  public void f() {
	  Reporter.log("kk",true);
  }
  @Test(groups="ram2",priority=1)
  public void f1() {
	  Reporter.log("kkuu",true);
  }
  @Test(groups="ram",priority=2)
  public void f3() {
	  Reporter.log("hai",true);
  }
}
