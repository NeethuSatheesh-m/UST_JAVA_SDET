const {Builder, By, Key, until} = require('selenium-webdriver');

// You can use a remote Selenium Hub, but we are not doing that here
require('chromedriver');
const driver = new Builder()
.forBrowser('chrome')
.build();

jasmine.DEFAULT_TIMEOUT_INTERVAL = 20 * 1000;

describe('Selenium test case for login page', () => {

it('Should navigate to Demo Page', async function()  {
await driver.get('https://www.urbanladder.com/');
await driver.getCurrentUrl().then((url) => {
expect(url).toBe('https://www.urbanladder.com/');
driver.manage().window().maximize();
});
});

it('title check',async function(){
    expected = "Furniture Online: @Upto 40% Off on Wooden Furniture Online in India at Best Price - Urban Ladder";
    actual =await driver.getTitle();
    console.log(actual);
expect(actual).toBe(expected);
});

it('login',async  function(){
    var s1=driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/section[3]/ul/li[2]/span"));
    await s1.click();
    var s2=driver.findElement(By.partialLinkText("Log In"));
    await s2.click();
    await driver.sleep(3000);
    await driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/input")).sendKeys( "harimurali007@gmail.com");
    await driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/div/div/input")). sendKeys("harimurali007");
    await driver.findElement(By.id("ul_site_login")).click();
});
it('bed',async  function(){
     await driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[3]/span")).click();
     var rd= await driver.findElement(By.partialLinkText('Bed'));
     let data=await rd.getText();
    console.log(data);
   // expect(data).toBe('Bed');

});
it('matteress',async  function(){
    await driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[3]/span")).click();
    var rd= await driver.findElement(By.partialLinkText('Mattresses'));
    let data=await rd.getText();
   console.log(data);
   //expect(data).toBe('Mattresses');

});
it('Storage & Accessories',async  function(){
    await driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[3]/span")).click();
    var rd= await driver.findElement(By.partialLinkText('Storage & Accessories'));
    let data=await rd.getText();
   console.log(data);
   expect(data).toBe('Storage & Accessories');

});
it('Kids Bedroom',async  function(){
    await driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[3]/span")).click();
    var rd= await driver.findElement(By.partialLinkText('Kids Bedroom'));
    let data=await rd.getText();
   console.log(data);
   expect(data).toBe('Kids Bedroom');

});
it('Bed Click',async  function(){
    await driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[3]/span")).click();
    await driver.findElement(By.partialLinkText('Double Beds')).click();
});
it('filter',async  function(){
    await driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[1]")).click();
	await driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[2]/div/div/ul/li[2]/div[1]/label/input")).click();

    });
});

