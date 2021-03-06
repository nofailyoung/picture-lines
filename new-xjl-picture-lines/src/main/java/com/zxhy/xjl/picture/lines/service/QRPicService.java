/**
 * 
 */
package com.zxhy.xjl.picture.lines.service;

import java.io.File;

/**
 * @author lenovo
 *
 */
public interface QRPicService {

	/**
	 * 生成附加指纹的二维码图片
	 * @param text  生成QR码的文字
	 * @param logoAddress  生成QR码上面的logo地址
	 * @param newLogoAddress  将QR码和logo结合之后生成图片的地址,可为空
	 * @param ifCompressed   是否压缩logo图片
	 * @param picAddress     待生成二维码防伪图的图片地址
	 * @param x     水印水平位置，以左上角为坐标原点
	 * @param y     水印垂直位置，以左上角为坐标原点
	 * @param alpha  水印透明(0.1f-1.0f)
	 * @param n   指纹重数
	 */
  public void getQRPic(String text,String logoAddress,String newLogoAddress,boolean ifCompressed,String picAddress,int x,int y,float alpha,int n);	
	
  /**
   * 离线验证
   * @param srcFile    原图片地址
   * @param destFile   目标图片地址
   * @param n       指纹重数
   */
  public void offlineCheck(String srcFile, String destFile,int n);
  
  
  /**
   * 在线验证
   */
  public void onlineCheck();
  
}
