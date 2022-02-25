class Solution {
    public int compareVersion(String v1, String v2) {
        
        if (v1.equals(v2)) return 0;
        
		String ver1[] = v1.split("\\.");
		String ver2[] = v2.split("\\.");
		int maxLength = Math.max(ver1.length, ver2.length);
		int flag = 0;
		for (int i = 0; i < maxLength; i++) {
			int num1 = ver1.length >= i + 1 ? Integer.parseInt(ver1[i]) : 0;
			int num2 = ver2.length >= i + 1 ? Integer.parseInt(ver2[i]) : 0;
			if (num1 > num2) return 1;
			else if (num1 < num2) return -1;
			
		}
		return flag;
    }
}