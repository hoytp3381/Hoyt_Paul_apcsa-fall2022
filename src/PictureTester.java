/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  public static void testKeepOnlyRed() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyRed();
	  beach.explore();
  }
  public static void testKeepOnlyGreen() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyGreen();
	  beach.explore();
  }
  public static void testNegate() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  public static void testGrayscale() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  public static void testFixUnderwater() {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrowVerticalLeftToRight() {
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorVerticalLeftToRight();
	  caterpillar.explore();
  }
  public static void testMirrorHorizontal() {
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorHorizontal();
	  caterpillar.explore();
  }
  public static void testMirrorHorizontalBotToTop() {
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorHorizontalBotToTop();
	  caterpillar.explore();
  }
  public static void testMirrorDiagonal() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("beach.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void testImage() {
	  Picture image = new Picture("seagull.jpg");
	  image.explore();
  }
  public static void testMirrorArms() {
	  Picture snowman = new Picture("snowman.jpg");
//	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  public static void testMirrorGull() {
	  Picture gull = new Picture("seagull.jpg");
//	  Picture gull2 = new Picture("seagull.jpg");
//	  gull2.mirrorGull();
//	  gull2.mirrorVertical();
//	  gull2.explore();
	  gull.explore();
	  gull.mirrorGull();
//	  gull.copy(gull2,232,484,319,587);
	  gull.explore();
  }
  
  public static void testCopy() {
	  Picture a = new Picture("beach.jpg");
	  Picture b = new Picture("snowman.jpg");
	  a.explore();
	  a.copy(b,100,100,300,300);
	  a.explore();
  }
  public static void testMyCollage() {
	  Picture a = new Picture("beach.jpg");
	  Picture b = new Picture("beach.jpg");
	  Picture c = new Picture("beach.jpg");
	  Picture d = new Picture("snowman.jpg");
	  a.explore();
	  b.zeroBlue();
	  c.mirrorDiagonal();
	  d.keepOnlyRed();
	  a.copy(b, 300,300,400, 400);
	  a.copy(c, 0, 0,250,250);
	  a.copy(d, 380,380,480,480);
	  a.explore();
  }
  public static void testBlur(int x, int y, int w, int h, int n) {
	  Picture image = new Picture("redMotorcycle.jpg");
	  image.explore();
	  for (int i = 0; i<n; i++){
		  image.blur(x,y,w,h);
	  }
	  image.explore();

  }
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue(); //done
//    testKeepOnlyBlue(); //done
//    testKeepOnlyRed(); //done
//    testKeepOnlyGreen(); //done
//    testNegate(); //done
//    testGrayscale(); //done
//    testFixUnderwater(); //done
//    testMirrorVertical(); //done
//	  testMirrowVerticalLeftToRight(); //done
//	  testMirrorHorizontal(); //done
//	  testMirrorHorizontalBotToTop(); //done
//	  testMirrorDiagonal(); //done
//    testMirrorTemple(); //done
//	  testImage(); //done
//    testMirrorArms(); //done
//    testMirrorGull(); //done
//    testCollage(); //done
//    testCopy(); //done
//    testMyCollage(); //done
//	  testEdgeDetection(); //done
//	  testEdgeDetection2(); //done
	  testBlur(77,68,25,25,10); //done
	  
	  //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}