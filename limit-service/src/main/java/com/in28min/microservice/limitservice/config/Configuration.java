package com.in28min.microservice.limitservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-service")



public class Configuration {
		private Integer max;
		public Integer getMax() {
			return max;
		}
		public void setMax(Integer max) {
			this.max = max;
		}
		public Integer getMin() {
			return min;
		}
		public void setMin(Integer min) {
			this.min = min;
		}
		private Integer min;
}
