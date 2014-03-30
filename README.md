# Opensubtitles.org Hash Function

[![Donate](https://www.paypalobjects.com/en_US/i/btn/btn_donate_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=NYVPSL7GBYD6A&lc=US&item_name=Oscar%20Brito&currency_code=EUR&bn=PP%2dDonationsBF%3abtn_donateCC_LG%2egif%3aNonHosted)

[![Divhide](http://site.divhide.com/assets/img/github_powered_by.jpg)](http://site.divhide.com/) 

Java implementation of the OpenSubtitles hash function. This hash is used by opensubtitles.org to create unique id
for movie files. 

Useful when searching subtitles for a specific file. 

<dl>
  <dt>Execute:</dt>
  <dd>
    <p>java -jar <i>bin/opensubtitles-hash-generator.jar</i> <b>FILE</b> </p>
    <p>The HASH is returned on the STDOUT</p>
  </dd>
  
  <dt>Example:</dt>
  <dd>
    <p>java -jar <i>bin/opensubtitles-hash-generator.jar</i> <b>tests/breakdance.avi</b> </p>
    <p>8e245d9679d31e12</p>
  </dd>
</dl>

