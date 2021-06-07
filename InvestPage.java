package com.lemon.pages;

import com.lemon.base.BasePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @Project: class_28
 * @Site: 天道酬勤！！
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: Admin
 * @Create: 2021-05-20 16:19
 * @Desc：
 **/
public class InvestPage extends BasePages {
    //投资输入框
    By investInputBy = By.xpath("//input[@data-url='/Invest/invest']");
    //投标按钮
    By investButtonBy = By.xpath("//button[text()='投标']");
    //投资成功提示
    By  investSuccess = By.xpath("//div[text()='投标成功！']");
    //项目可投金额
    By  amountToBeInvestBy = By.xpath("//span[@class='mo_span4']");
    //关闭弹窗
    By  closePopBy = By.xpath("//div[@class='layui-layer-content']//div[1]//div[1]//img");



    public void closePop(){
        //driver.findElement(closePopBy).click();
        click(closePopBy,"投资页面_弹窗关闭按钮");
    }




    /**
     * 获取项目可投金额

     * @return
     */
    public double getamountToBeInvest(){
        String amount = getText(amountToBeInvestBy,"投资页面_可投金额");
        //字符串转成整型？？因为项目的可投金额单位是万，所以需要转换
         return Double.parseDouble(amount)*10000;
    }

    /**
     * 获取用户可投金额

     * @return
     */
    public double getUserleaveAmout(){
        String leaveamount = getAttrribute(investInputBy,"data-amount","投资页面_可用余额");
        //String leaveamount= driver.findElement(investInputBy).getAttribute("data-amount");
        return Double.parseDouble(leaveamount);
    }

    /**
     * 获取投资成功元素文本信息

     * @return
     */
    public String getInvestSuccessTips(){
        return getText(investSuccess,"投资页面_投资成功提示");
    }


    /**
     * 投资业务操作

     * @param investAmount 投资金额
     */
    public void invest(String investAmount){
        //driver.findElement(investInputBy).sendKeys(investAmount);
        type(investInputBy,"投资页面_投资金额输入框",investAmount);
        //driver.findElement(investButtonBy).click();
        click(investButtonBy,"投资页面_投资按钮");
    }

}
