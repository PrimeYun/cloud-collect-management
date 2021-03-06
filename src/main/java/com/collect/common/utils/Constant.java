package com.collect.common.utils;

public class Constant {
	
	public static final String USER_INFO = "CLOUD_COLLECT";

	// 云服务商
	public enum CloudService {
		//本地
		LOCAL(0),
		// 阿里云
		ALIYUN(1);

		private int value;

		private CloudService(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

}
