from selenium import webdriver
from bs4 import BeautifulSoup
import pandas as pd
import datetime
import time

wd = webdriver.Chrome()

result = []
#for page in range(1,11):
wd.get("https://www.theventi.co.kr/new2022/store/index.html?page=1}&plist=&find_field=&find_word=&find_state=&find_ordby=&conf=&find_mode=&city=&county=")
time.sleep(1)
#wd.execute_script(f"storePop2({i})")
# time.sleep(1)
html = wd.page_source
soupCB = BeautifulSoup(html, 'html.parser')
for store in soupCB.select("div.store_table>div.menu_body>div.tr"):
    store_name = store.find("p",attrs={"class":"tit_b _mc"}).string
    store_address = store.find("div", attrs={"class":"address"}).string
    result.append([store_name]+[store_address])

CB_tbl = pd.DataFrame(result, columns=('store_name','store_address'))
CB_tbl.to_csv("tehVenti.csv", encoding="utf-8", mode="w", index=True)
