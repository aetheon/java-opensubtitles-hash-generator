# Hash Function Executable based on Media Player Classic

Java implementation of the OpenSubtitles hash function. This hash is used to create unique id
for movie files. 

Useful for searching subtitles for a specific file. 

<dl>
  <dt>Execute:</dt>
  <dd>
    <p>java -jar bin/opensubtitles-hash-generator.jar FILE </p>
    <p>The HASH is returned on the STDOUT</p>
  </dd>
  
  <dt>Example:</dt>
  <dd>
    <p>java -jar bin/opensubtitles-hash-generator.jar tests/breakdance.avi</p>
    <p>8e245d9679d31e12</p>
  </dd>
</dl>

