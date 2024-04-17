package q6;

class HybridDevice implements SmartphoneFeatures, TabletFeatures {

	@Override
	public String tRun() {
		return "Tablet Runs";
	}

	@Override
	public String sRun() {
		return "SmartPhone Runs";
	}

	
}
