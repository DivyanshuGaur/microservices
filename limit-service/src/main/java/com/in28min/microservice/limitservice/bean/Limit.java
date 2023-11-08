package com.in28min.microservice.limitservice.bean;

public class Limit {
	
		private Integer min;
		public Integer getMin() {
			return min;
		}
		public Limit(Integer min, Integer max) {
			super();
			this.min = min;
			this.max = max;
		}
		public void setMin(Integer min) {
			this.min = min;
		}
		public Integer getMax() {
			return max;
		}
		public void setMax(Integer max) {
			this.max = max;
		}
		private Integer max;
}
