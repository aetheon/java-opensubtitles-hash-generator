# Opensubtitles.org Hash Function

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

