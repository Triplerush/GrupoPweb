class Calculator {
  int add(int a, int b){ return 0; }
  int sub(int a, int b){ return a-b; }
  int mul(int a, int b){ return 0; }

  int div(int a, int b){
		if (b == 0){
			return 0;
	  }
		int result = a/b;
		return result;
	}

	int mod(int a, int b){
		int result = a%b;
	    return result;
	}
}

