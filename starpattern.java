package snehal.methods;

public class Snippet {
	public void star(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public void Leftbottomstar(int a) {

		for (int i = 1; i <= a; i++) {
			for (int j = a; j >= i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

	public static void rightsidetop(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = a; j >= i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" " + "*");
			}
			System.out.println();
		}
	}

	public static void rightsidebottom(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = a; k >= i; k--) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}

	public void sevenstar() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int l = 5; l <= 7; l++) {
				for (int k = 3; k >= l; k--) {
					System.out.print("*");
				}
			}
		}
		System.out.println();
	}

	public void lefttoright(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int i = 0; i <= a; i++) {
			for (int j = a; j >= i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

	public void righttoleft(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = a; j > i; j--) {
				System.out.print("  ");

			}
			for (int k = 0; k < i; k++) {
				System.out.print("*" + " ");

			}
			System.out.println();
		}
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public void numAndCharcomm(int a) {
		for (int i = 1; i <= a; i++) {
			char ch = 'a';
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0) {
					System.out.print(j + " ");
				} else {
					System.out.print(ch + " ");
					ch++;
				}
			}
			System.out.println();
		}
	}

	public void knitestarpattern(int a) {

		for (int i = 1; i <= a; i++) {
			for (int j = a; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = 2; i <= a; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = a; k >= i; k--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public void pyramidup(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = a; j > i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("   *");
			}
			System.out.println();
		}
	}

	public void alphabetsLeftTriangle(int a) {
		char ch = 'a';
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();

		}

	}

	public void numberlefttriangle(int a) {
		int b = 1;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(b + " ");
				b++;
			}
			System.out.println();

		}

	}

	public void square(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

	public void hallowsquare(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if (i == a || i == 1 || j == 1 || j == a) {

					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

	public void sleepingline(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {

				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public void rightsleepingline(int a) {

		for (int i = 1; i <= a; i++) {
			for (int j = a; j >= i; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println("");

		}
	}

	public void Swastik(int a) {
		int b = a / 2;
		for (int i = 1; i <= a; i++) {
			for (int j = 0; j <= a; j++) {

				if ((i == b && j <= a) || (j == b && i <= a) || (i == 1 && j >= b) || (i == a && j <= b)
						|| (j == 0 && i <= b) || (j == a && i >= b)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

	public void letter(int c) {
		int e;
		if (c % 2 != 0) {
			e = c + 1;
		} else {
			e = c;
		}
		int d = e / 2;
		for (int a = 1; a <= c; a++) {
			for (int b = 1; b <= c; b++) {
				if (a == 1 || a == d || a == c || (a <= d && b == 1) || (a >= d && b == c)) {
					System.out.print("*");
				}

				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public void letters(int c) {
		int e;
		if (c % 2 != 0) {
			e = c + 1;
		} else {
			e = c;
		}
		int d = e / 2;
		for (int a = 1; a <= c; a++) {
			for (int b = 1; b <= c; b++) {
				if ((a <= 2 || a == d || a == c || a == d + 1 || a == c - 1) || (a <= d && b <= 2) || (b == c && a >= d)
						|| (b == c - 1 && a >= d)) {
					System.out.print("* ");
				}

				else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

	public void I(int d) {
		int e;
		if (d % 2 != 0) {
			e = d + 1;
		} else {
			e = d;
		}
		int c = e / 2;

		for (int a = 1; a <= e; a++) {
			for (int b = 1; b <= e; b++) {
				if (a == 1 || a == e || (b == c && a <= e)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public void doubleI(int c) {
		int d = c / 2;
		int e = d + 1;
		for (int a = 1; a <= c; a++) {
			for (int b = 1; b <= c; b++) {
				if (a <= 2 || a == c || a == (c - 1) || (b == d || b == e && a <= c)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

	public void U(int c) {
		int d = c - 1;
		for (int i = 1; i <= c; i++) {
			for (int j = 1; j <= c; j++) {
				if ((i <= c && j <= 2) || (j == d || j == c && i <= c) || i == c || i == d) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public void heart(int n) {
		int m = n / 2;
		int a = n + 2;
		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= n; j++) {
				if ((((j > 0 && j != n) && j != m) && i == 0) || (i == 1 && (j == 0 || j == m || j == n))
						|| ((i - j == 2) && (j <= m)) || ((j + i == a) && j > m - 1)) {
					System.out.print("* ");
				} else {

					System.out.print("  ");

				}

			}
			System.out.println();
		}
	}

	public void hallowrighttriangle(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == 3 && j == 2) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	public void hollowshankarpali(int a) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if ((k == 1 && i <= 4) || (i == k)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 3; k >= i; k--) {
				if (i == 1 && k == 2) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}

			}
			System.out.println();
		}
	}

	public void hollowrRightSideTriangle(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = a; j > i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {

				if ((i == a && k <= a) || (i == k) || (k == 1 && i <= a)) {
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();

		}

	}

}
