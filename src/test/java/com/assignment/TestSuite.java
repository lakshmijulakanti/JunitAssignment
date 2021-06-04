package com.assignment;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages(value = {"com.assignment"})
@SelectClasses({BookTest.class,CalculatorTest.class})
public class TestSuite {
}
