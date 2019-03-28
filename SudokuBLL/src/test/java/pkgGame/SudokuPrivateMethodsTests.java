package pkgGame;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.Test;

public class SudokuPrivateMethodsTests {
	
	// print starts
		private void printStars() {
			for (int i = 0; i < 50; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	@Test
	public void FillDiagonalRegions_Test() {
		Sudoku s1 = null;
		int puzzleSize = 9;
		try {
			Class cls = s1.getClass();
			Constructor constr = cls.getConstructor(new Class[] {int.class});
			constr.setAccessible(true);
			s1 = (Sudoku) constr.newInstance(puzzleSize);
			
			
			Method meth = cls.getDeclaredMethod("FillDiagonalRegions", null);
			meth.setAccessible(true);
			meth.invoke(s1, null);
			
			printStars();
			s1.PrintPuzzle();
			//System.out.println(Arrays.toString(s1.getRegion(0)));
			printStars();
		
			//System.out.println("Testing method: "+ Thread.currentThread().getStackTrace()[1].getMethodName());
			
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void setRegion_Test() throws ClassNotFoundException {
		Sudoku s1 = null;
		int iPuzzleSize = 9;
		int[] iExpectedReg = new int[iPuzzleSize];
		for (int i=0; i<iPuzzleSize; i++) {
			iExpectedReg[i] = i + 1;
		}
		int[] iActualReg;
		try {
			Class c = Class.forName("pkgGame.Sudoku");
			Constructor constr = c.getConstructor(new Class[] {int.class});
			constr.setAccessible(true);
			s1 = (Sudoku) constr.newInstance(iPuzzleSize);
			
			Method meth = c.getDeclaredMethod("SetRegion", new Class[] { int.class });
			meth.setAccessible(true);
			meth.invoke(s1, null);
			
			printStars();
			s1.PrintPuzzle();
			printStars();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			printStars();
		}
	}
	
