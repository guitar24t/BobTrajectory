package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideSwitchPart4 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (7.00,0.00,0.00)
	// (3.42,-1.33,45.00)
	
    public SameSideSwitchPart4() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SameSideSwitchPart4(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{0.014,0.276,10.000,0.000},
				{0.069,0.553,10.000,0.000},
				{0.194,1.244,10.000,0.000},
				{0.415,2.212,10.000,0.000},
				{0.760,3.455,10.000,0.000},
				{1.258,4.975,10.000,0.000},
				{1.935,6.770,10.000,0.000},
				{2.819,8.841,10.000,0.000},
				{3.937,11.185,10.000,0.000},
				{5.318,13.804,10.000,0.000},
				{6.987,16.695,10.000,0.001},
				{8.973,19.857,10.000,0.001},
				{11.302,23.288,10.000,0.002},
				{14.000,26.987,10.000,0.003},
				{17.082,30.814,10.000,0.005},
				{20.545,34.630,10.000,0.007},
				{24.388,38.432,10.000,0.009},
				{28.610,42.221,10.000,0.013},
				{33.209,45.993,10.000,0.017},
				{38.184,49.747,10.000,0.023},
				{43.532,53.482,10.000,0.030},
				{49.252,57.196,10.000,0.038},
				{55.341,60.888,10.000,0.049},
				{61.796,64.555,10.000,0.061},
				{68.616,68.196,10.000,0.076},
				{75.797,71.809,10.000,0.093},
				{83.336,75.392,10.000,0.113},
				{91.230,78.944,10.000,0.136},
				{99.477,82.461,10.000,0.163},
				{108.071,85.942,10.000,0.193},
				{117.009,89.386,10.000,0.228},
				{126.288,92.789,10.000,0.267},
				{135.903,96.150,10.000,0.312},
				{145.850,99.467,10.000,0.361},
				{156.124,102.736,10.000,0.417},
				{166.719,105.956,10.000,0.480},
				{177.631,109.123,10.000,0.549},
				{188.855,112.237,10.000,0.625},
				{200.384,115.293,10.000,0.710},
				{212.213,118.289,10.000,0.804},
				{224.336,121.222,10.000,0.906},
				{236.745,124.090,10.000,1.019},
				{249.434,126.890,10.000,1.142},
				{262.395,129.618,10.000,1.277},
				{275.622,132.271,10.000,1.423},
				{289.107,134.846,10.000,1.583},
				{302.841,137.340,10.000,1.756},
				{316.816,139.750,10.000,1.943},
				{331.023,142.073,10.000,2.146},
				{345.454,144.304,10.000,2.365},
				{360.098,146.441,10.000,2.601},
				{374.946,148.480,10.000,2.855},
				{389.988,150.419,10.000,3.128},
				{405.213,152.253,10.000,3.422},
				{420.611,153.980,10.000,3.737},
				{436.171,155.597,10.000,4.074},
				{451.881,157.101,10.000,4.434},
				{467.730,158.490,10.000,4.819},
				{483.706,159.763,10.000,5.230},
				{499.798,160.917,10.000,5.667},
				{515.993,161.953,10.000,6.133},
				{532.280,162.870,10.000,6.628},
				{548.647,163.670,10.000,7.153},
				{565.072,164.253,10.000,7.709},
				{581.525,164.527,10.000,8.297},
				{597.976,164.510,10.000,8.917},
				{614.398,164.220,10.000,9.568},
				{630.766,163.678,10.000,10.250},
				{647.056,162.908,10.000,10.963},
				{663.250,161.932,10.000,11.707},
				{679.327,160.778,10.000,12.479},
				{695.275,159.471,10.000,13.280},
				{711.079,158.040,10.000,14.107},
				{726.730,156.512,10.000,14.959},
				{742.221,154.914,10.000,15.833},
				{757.549,153.274,10.000,16.728},
				{772.710,151.617,10.000,17.640},
				{787.715,150.051,10.000,18.568},
				{802.583,148.677,10.000,19.510},
				{817.330,147.474,10.000,20.462},
				{831.968,146.373,10.000,21.424},
				{846.501,145.335,10.000,22.390},
				{860.938,144.370,10.000,23.358},
				{875.286,143.481,10.000,24.324},
				{889.553,142.668,10.000,25.285},
				{903.746,141.925,10.000,26.237},
				{917.870,141.241,10.000,27.177},
				{931.930,140.601,10.000,28.101},
				{945.929,139.988,10.000,29.007},
				{959.866,139.379,10.000,29.893},
				{973.741,138.749,10.000,30.754},
				{987.549,138.073,10.000,31.590},
				{1001.281,137.322,10.000,32.398},
				{1014.931,136.504,10.000,33.176},
				{1028.499,135.680,10.000,33.924},
				{1041.988,134.884,10.000,34.642},
				{1055.397,134.097,10.000,35.329},
				{1068.728,133.304,10.000,35.986},
				{1081.977,132.492,10.000,36.613},
				{1095.142,131.647,10.000,37.210},
				{1108.217,130.759,10.000,37.777},
				{1121.199,129.819,10.000,38.315},
				{1134.081,128.819,10.000,38.825},
				{1146.857,127.753,10.000,39.307},
				{1159.518,126.615,10.000,39.762},
				{1172.058,125.400,10.000,40.191},
				{1184.469,124.105,10.000,40.594},
				{1196.741,122.727,10.000,40.973},
				{1208.868,121.265,10.000,41.327},
				{1220.839,119.716,10.000,41.659},
				{1232.647,118.080,10.000,41.969},
				{1244.283,116.356,10.000,42.257},
				{1255.737,114.543,10.000,42.526},
				{1267.002,112.643,10.000,42.774},
				{1278.067,110.655,10.000,43.004},
				{1288.925,108.580,10.000,43.216},
				{1299.567,106.419,10.000,43.412},
				{1309.984,104.173,10.000,43.591},
				{1320.169,101.842,10.000,43.755},
				{1330.112,99.429,10.000,43.905},
				{1339.805,96.934,10.000,44.041},
				{1349.241,94.359,10.000,44.164},
				{1358.412,91.706,10.000,44.275},
				{1367.309,88.975,10.000,44.375},
				{1375.926,86.170,10.000,44.464},
				{1384.255,83.290,10.000,44.544},
				{1392.289,80.339,10.000,44.614},
				{1400.021,77.319,10.000,44.676},
				{1407.444,74.230,10.000,44.730},
				{1414.552,71.077,10.000,44.777},
				{1421.338,67.859,10.000,44.818},
				{1427.796,64.581,10.000,44.853},
				{1433.920,61.245,10.000,44.882},
				{1439.705,57.852,10.000,44.907},
				{1445.146,54.406,10.000,44.928},
				{1450.237,50.910,10.000,44.945},
				{1454.974,47.365,10.000,44.959},
				{1459.351,43.776,10.000,44.969},
				{1463.366,40.146,10.000,44.978},
				{1467.013,36.477,10.000,44.984},
				{1470.291,32.773,10.000,44.989},
				{1473.194,29.037,10.000,44.993},
				{1475.727,25.328,10.000,44.995},
				{1477.906,21.787,10.000,44.997},
				{1479.756,18.502,10.000,44.998},
				{1481.304,15.476,10.000,44.999},
				{1482.575,12.714,10.000,44.999},
				{1483.597,10.218,10.000,45.000},
				{1484.396,7.992,10.000,45.000},
				{1485.000,6.038,10.000,45.000},
				{1485.436,4.357,10.000,45.000},
				{1485.731,2.950,10.000,45.000},
				{1485.913,1.819,10.000,45.000},
				{1486.009,0.964,10.000,45.000},
				{1486.047,0.385,10.000,45.000},
				{1486.056,0.082,10.000,45.000},
				{1486.056,0.000,10.000,45.000}		};

}