import time

from selenium import webdriver

for x in range(1, 20):

    driver = webdriver.Chrome()

    driver.get("https://multiplatform.blockverse.tech/projects/meenu/wan21")

    time.sleep(1)

    driver.quit()

    print(x)