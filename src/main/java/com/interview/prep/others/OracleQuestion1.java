package com.interview.prep.others;

	interface Rideable {
		//only public & abstract keywords are permitted.
		// it will throw error if we have not mention any access modifier in interface.
		public String getGait();
	}

	class OracleQuestion1 implements Rideable {
		int weight = 2;

		 public String getGait() {
			return " mph, lope";
		}

		void go(int speed) {
			++speed;
			weight++;
			int walkrate = speed * weight;
			System.out.print(walkrate + getGait());
		}

		public static void main(String[] args) {
			new OracleQuestion1().go(8);
		}
	}

