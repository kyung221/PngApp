# PngApp
## ImageData
### PNG reader
read a PNG image from file or stream\
Each row is read as an ImageLineByte object (one byte per sample),
uses byte to store the samples.
```java
PngReaderByte pngr
```

### Channels
Number of channels \
1 for grayscale or indexed, 2 for GA(gray with alpha, 3 for RGB, 4 for RGBA   
```java
int channels = pngr.imgInfo.channels;
```

### Width & Height

Image widrh & height in pixel

```java
int width = pngr.imgInfo.cols;
int height = pngr.imgInfo.rows;
```

### Read image data

```java
while(pngr.hasMoreRows()){ //true if next row to read exists
ImageLineByte line = pngr.readRowByte(); //read next row, 
                                         //caller must know that there are more rows to read
byte line1 = line.getScanLineByte(); //return scanline, one byte for sample
...
}
```
>The 'scanline' is an array of integers, corresponds to an image line (row).
Each int is a "sample" (one for channel), (0-255 or 0-65535) in the corresponding PNG sequence


