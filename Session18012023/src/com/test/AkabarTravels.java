package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.HomePageAkbarTravals;

public class AkabarTravels extends TestBase{
	HomePageAkbarTravals homepageakbartravels;
public AkabarTravels()
{
	super();
}
@BeforeClass
public void setUp() {
	initialization();
	homepageakbartravels=new HomePageAkbarTravals();
}
@Test (priority=1)
public void selectFrom() {
	homepageakbartravels.selectFrom();
}
@Test (priority=2)
public void selectTo() {
	homepageakbartravels.selectTo();
} 
@Test (priority=3)
public void selectedPlaces() {
	homepageakbartravels.verifySelectedPlace();
}
}
