


int x1=input1.indexOf(" ");
        String s2=input1.substring(x1+1);
        int x2=s2.indexOf(" ");
        String s3=input1.substring(x1+1,x1+x2+1);
      	String s1 = s3.toUpperCase();
		return s1;
  }
}
