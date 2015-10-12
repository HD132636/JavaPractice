/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 	 |_ AgeCheckException
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 9. 23.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class AgeCheckException extends Exception {
	
	public AgeCheckException() {
		
	}
	
	public AgeCheckException(Movie movie) {
		super(movie.getTitle() + "��/��" + movie.getLimitAge() + "�� �̻� �������Դϴ�.");
	}
}
