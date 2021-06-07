package com.lemon.pages;

import com.lemon.base.BasePages;
import com.lemon.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @Project: class_28
 * @Site: 天道酬勤！！
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: Admin
 * @Create: 2021-05-20 15:10
 * @Desc：
 **/
public class IndexPage extends BasePages {
    //退出
    By quitBy = By.linkText("退出");
    //我的账号
    By myAccountBy = By.xpath("//a[contains(text(),'我的帐户')]");
    //抢投标
    //By bidButtonBy = By.xpath("//*[contains(text(),'"+totitle+"')]/parent::div/parent::a/following-sibling::div//a");

    /**
     * 首页点击抢投标按钮
     * @param loanTitle 项目标题
     */
    public void clickBid(String loanTitle){
        By bidBy = By.xpath("//span[contains(text(),'"+loanTitle+"')]/parent::div/parent::a/following-sibling::div[1]//a");
        click(bidBy,"首页页面_项目标题");
    }



    /**
     * 判断【退出】元素是否可见
     * @return 可见状态
     */

    public boolean isQuitVisible(){
        //WebElement webElement1 = BaseTest.driver.findElement(quitBy);
        //boolean isQuitDisplay = webElement1.isDisplayed();
        return isElemenVisible(quitBy,"首页页面_退出按钮");
    }


    /**
     * 判断【我的账号】元素是否可见

     * @return 可见状态
     */
    public boolean ismyAccounVisible(){
        //WebElement webElement2  =BaseTest.driver.findElement(myAccountBy);
        //boolean isMyaccountDisplay = webElement2.isDisplayed();
         return isElemenVisible(myAccountBy,"首页页面_我的账户页面");
    }

}
