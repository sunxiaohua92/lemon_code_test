package com.lemon.pages;

import com.lemon.base.BasePages;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @Project: class_28
 * @Site: 天道酬勤！！
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: Admin
 * @Create: 2021-05-20 14:53
 * @Desc：
 **/
public class LoginPage extends BasePages {
    //Logger logger = Logger.getLogger(LoginPage.class);
    //属性--元素的定位信息（元素的定位方式+表达式值）
   //手机号码输入框
    By phoneby = By.name("phone");
   //密码输入框
    By pwdby = By.name("password");
    //登录按钮
    By  loginBy = By.xpath("//button[text()='登录']");
    //页面中间的提示信息
    By centerTipsBy = By.xpath("//div[@class='layui-layer-content']");
    //页面输入框的提示信息
    By inputTipBy =By.xpath("//div[@class='form-error-info']");

    /**
     * 登录的操作方法

     * @param phone  手机号码
     * @param pwd    密码
     */
    public void login(String phone,String pwd){
        type(phoneby,"登录页面_手机号码输入框",phone);
        type(pwdby,"登录页面_密码输入框",pwd);
        //driver.findElement(phoneby).sendKeys(phone);
        //driver.findElement(pwdby).sendKeys(pwd);
        //driver.findElement(loginBy).click();
        click(loginBy,"登录页面_登录按钮");
    }



    /**
     * 获取页面的中间提示信息

     * @return
     */
    public String getCenterTips(){
        return  getText(centerTipsBy,"登陆页面_中间提示信息");
    }


    /**
     * 获取页面的输入框提示信息

     * @return
     */
    public String  getInputTips(){
        return  getText(inputTipBy,"登陆页面_输入框提示信息");

  }



}
