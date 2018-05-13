package com.example

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebElement}

object Main extends App {
//  val options = new ChromeOptions
//  options.addArguments("headless")
//  options.addArguments("window-size=1200x600")
//  val driver = new ChromeDriver(options)

  val driver = new ChromeDriver()

  val start: Long = System.currentTimeMillis

  driver.get("http://www.clocktab.com/")

  val navigation: Long = System.currentTimeMillis

  System.out.println("Navigation in " + (navigation - start) + " milliseconds.")

  val element: WebElement = driver.findElement(By.id("time"))

  val pageLoad: Long = System.currentTimeMillis

  System.out.println("Page load in " + (pageLoad - start) + " milliseconds.")

  val time: String = element.getText

  System.out.println("The current time is " + time)

  val hour: Int = time.substring(0, 2).toInt

  if (1 == hour) throw new IllegalArgumentException("Subprimes are exceptional!")

  if (List(2, 3, 5, 7, 11).contains(hour)) {
    System.out.println("Primetime!")
    System.exit(0)
  }

  if (List(4, 6, 8, 9, 10, 12).contains(hour)) {
    System.out.println("Not prime. Come back later.")
    System.exit(1)
  }

  System.out.println("Well this was unexpected!.")
  System.exit(1)
}
