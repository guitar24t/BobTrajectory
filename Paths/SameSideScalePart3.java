package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideScalePart3 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (4.17,0.00,0.00)
	
    public SameSideScalePart3() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SameSideScalePart3(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{0.014,0.279,10.000,0.000},
				{0.070,0.557,10.000,0.000},
				{0.195,1.254,10.000,0.000},
				{0.418,2.229,10.000,0.000},
				{0.766,3.484,10.000,0.000},
				{1.268,5.016,10.000,0.000},
				{1.951,6.828,10.000,0.000},
				{2.829,8.779,10.000,0.000},
				{3.902,10.729,10.000,0.000},
				{5.170,12.680,10.000,0.000},
				{6.633,14.631,10.000,0.000},
				{8.291,16.582,10.000,0.000},
				{10.144,18.533,10.000,0.000},
				{12.193,20.483,10.000,0.000},
				{14.436,22.434,10.000,0.000},
				{16.874,24.385,10.000,0.000},
				{19.508,26.336,10.000,0.000},
				{22.337,28.287,10.000,0.000},
				{25.360,30.238,10.000,0.000},
				{28.579,32.188,10.000,0.000},
				{31.993,34.139,10.000,0.000},
				{35.602,36.090,10.000,0.000},
				{39.406,38.041,10.000,0.000},
				{43.405,39.992,10.000,0.000},
				{47.600,41.942,10.000,0.000},
				{51.989,43.893,10.000,0.000},
				{56.573,45.844,10.000,0.000},
				{61.353,47.795,10.000,0.000},
				{66.327,49.746,10.000,0.000},
				{71.497,51.696,10.000,0.000},
				{76.862,53.647,10.000,0.000},
				{82.422,55.598,10.000,0.000},
				{88.176,57.549,10.000,0.000},
				{94.126,59.500,10.000,0.000},
				{100.271,61.450,10.000,0.000},
				{106.612,63.401,10.000,0.000},
				{113.147,65.352,10.000,0.000},
				{119.877,67.303,10.000,0.000},
				{126.802,69.254,10.000,0.000},
				{133.923,71.204,10.000,0.000},
				{141.238,73.155,10.000,0.000},
				{148.749,75.106,10.000,0.000},
				{156.455,77.057,10.000,0.000},
				{164.355,79.008,10.000,0.000},
				{172.451,80.958,10.000,0.000},
				{180.742,82.909,10.000,0.000},
				{189.228,84.860,10.000,0.000},
				{197.909,86.811,10.000,0.000},
				{206.786,88.762,10.000,0.000},
				{215.857,90.713,10.000,0.000},
				{225.123,92.663,10.000,0.000},
				{234.585,94.614,10.000,0.000},
				{244.241,96.565,10.000,0.000},
				{254.093,98.516,10.000,0.000},
				{264.139,100.467,10.000,0.000},
				{274.381,102.417,10.000,0.000},
				{284.818,104.368,10.000,0.000},
				{295.450,106.319,10.000,0.000},
				{306.277,108.270,10.000,0.000},
				{317.299,110.221,10.000,0.000},
				{328.516,112.171,10.000,0.000},
				{339.928,114.122,10.000,0.000},
				{351.535,116.073,10.000,0.000},
				{363.338,118.024,10.000,0.000},
				{375.335,119.975,10.000,0.000},
				{387.528,121.925,10.000,0.000},
				{399.915,123.876,10.000,0.000},
				{412.498,125.827,10.000,0.000},
				{425.276,127.778,10.000,0.000},
				{438.249,129.729,10.000,0.000},
				{451.417,131.679,10.000,0.000},
				{464.780,133.630,10.000,0.000},
				{478.338,135.581,10.000,0.000},
				{492.091,137.532,10.000,0.000},
				{506.039,139.483,10.000,0.000},
				{520.169,141.294,10.000,0.000},
				{534.451,142.827,10.000,0.000},
				{548.859,144.081,10.000,0.000},
				{563.365,145.056,10.000,0.000},
				{577.940,145.753,10.000,0.000},
				{592.558,146.171,10.000,0.000},
				{607.189,146.311,10.000,0.000},
				{621.820,146.311,10.000,0.000},
				{636.451,146.311,10.000,0.000},
				{651.082,146.311,10.000,0.000},
				{665.713,146.311,10.000,0.000},
				{680.344,146.311,10.000,0.000},
				{694.975,146.311,10.000,0.000},
				{709.606,146.311,10.000,0.000},
				{724.237,146.311,10.000,0.000},
				{738.868,146.311,10.000,0.000},
				{753.499,146.311,10.000,0.000},
				{768.130,146.311,10.000,0.000},
				{782.761,146.311,10.000,0.000},
				{797.392,146.311,10.000,0.000},
				{812.023,146.311,10.000,0.000},
				{826.654,146.311,10.000,0.000},
				{841.285,146.311,10.000,0.000},
				{855.916,146.311,10.000,0.000},
				{870.547,146.311,10.000,0.000},
				{885.179,146.311,10.000,0.000},
				{899.810,146.311,10.000,0.000},
				{914.441,146.311,10.000,0.000},
				{929.072,146.311,10.000,0.000},
				{943.703,146.311,10.000,0.000},
				{958.334,146.311,10.000,0.000},
				{972.965,146.311,10.000,0.000},
				{987.596,146.311,10.000,0.000},
				{1002.227,146.311,10.000,0.000},
				{1016.858,146.311,10.000,0.000},
				{1031.489,146.311,10.000,0.000},
				{1046.120,146.311,10.000,0.000},
				{1060.751,146.311,10.000,0.000},
				{1075.382,146.311,10.000,0.000},
				{1090.013,146.311,10.000,0.000},
				{1104.644,146.311,10.000,0.000},
				{1119.275,146.311,10.000,0.000},
				{1133.906,146.311,10.000,0.000},
				{1148.537,146.311,10.000,0.000},
				{1163.168,146.311,10.000,0.000},
				{1177.800,146.311,10.000,0.000},
				{1192.431,146.311,10.000,0.000},
				{1207.062,146.311,10.000,0.000},
				{1221.693,146.311,10.000,0.000},
				{1236.324,146.311,10.000,0.000},
				{1250.955,146.311,10.000,0.000},
				{1265.586,146.311,10.000,0.000},
				{1280.217,146.311,10.000,0.000},
				{1294.848,146.311,10.000,0.000},
				{1309.479,146.311,10.000,0.000},
				{1324.110,146.311,10.000,0.000},
				{1338.741,146.311,10.000,0.000},
				{1353.372,146.311,10.000,0.000},
				{1368.003,146.311,10.000,0.000},
				{1382.634,146.311,10.000,0.000},
				{1397.265,146.311,10.000,0.000},
				{1411.896,146.311,10.000,0.000},
				{1426.527,146.311,10.000,0.000},
				{1441.157,146.295,10.000,0.000},
				{1455.769,146.125,10.000,0.000},
				{1470.337,145.676,10.000,0.000},
				{1484.832,144.948,10.000,0.000},
				{1499.226,143.942,10.000,0.000},
				{1513.492,142.657,10.000,0.000},
				{1527.601,141.093,10.000,0.000},
				{1541.527,139.266,10.000,0.000},
				{1555.259,137.315,10.000,0.000},
				{1568.795,135.364,10.000,0.000},
				{1582.137,133.414,10.000,0.000},
				{1595.283,131.463,10.000,0.000},
				{1608.234,129.512,10.000,0.000},
				{1620.990,127.561,10.000,0.000},
				{1633.551,125.610,10.000,0.000},
				{1645.917,123.659,10.000,0.000},
				{1658.088,121.709,10.000,0.000},
				{1670.064,119.758,10.000,0.000},
				{1681.845,117.807,10.000,0.000},
				{1693.430,115.856,10.000,0.000},
				{1704.821,113.905,10.000,0.000},
				{1716.016,111.955,10.000,0.000},
				{1727.017,110.004,10.000,0.000},
				{1737.822,108.053,10.000,0.000},
				{1748.432,106.102,10.000,0.000},
				{1758.847,104.151,10.000,0.000},
				{1769.067,102.201,10.000,0.000},
				{1779.092,100.250,10.000,0.000},
				{1788.922,98.299,10.000,0.000},
				{1798.557,96.348,10.000,0.000},
				{1807.997,94.397,10.000,0.000},
				{1817.241,92.447,10.000,0.000},
				{1826.291,90.496,10.000,0.000},
				{1835.146,88.545,10.000,0.000},
				{1843.805,86.594,10.000,0.000},
				{1852.269,84.643,10.000,0.000},
				{1860.539,82.693,10.000,0.000},
				{1868.613,80.742,10.000,0.000},
				{1876.492,78.791,10.000,0.000},
				{1884.176,76.840,10.000,0.000},
				{1891.665,74.889,10.000,0.000},
				{1898.959,72.938,10.000,0.000},
				{1906.057,70.988,10.000,0.000},
				{1912.961,69.037,10.000,0.000},
				{1919.670,67.086,10.000,0.000},
				{1926.183,65.135,10.000,0.000},
				{1932.502,63.184,10.000,0.000},
				{1938.625,61.234,10.000,0.000},
				{1944.553,59.283,10.000,0.000},
				{1950.286,57.332,10.000,0.000},
				{1955.825,55.381,10.000,0.000},
				{1961.168,53.430,10.000,0.000},
				{1966.316,51.480,10.000,0.000},
				{1971.268,49.529,10.000,0.000},
				{1976.026,47.578,10.000,0.000},
				{1980.589,45.627,10.000,0.000},
				{1984.957,43.676,10.000,0.000},
				{1989.129,41.726,10.000,0.000},
				{1993.107,39.775,10.000,0.000},
				{1996.889,37.824,10.000,0.000},
				{2000.476,35.873,10.000,0.000},
				{2003.869,33.922,10.000,0.000},
				{2007.066,31.972,10.000,0.000},
				{2010.068,30.021,10.000,0.000},
				{2012.875,28.070,10.000,0.000},
				{2015.487,26.119,10.000,0.000},
				{2017.904,24.168,10.000,0.000},
				{2020.125,22.218,10.000,0.000},
				{2022.152,20.267,10.000,0.000},
				{2023.984,18.316,10.000,0.000},
				{2025.620,16.365,10.000,0.000},
				{2027.062,14.414,10.000,0.000},
				{2028.308,12.463,10.000,0.000},
				{2029.359,10.513,10.000,0.000},
				{2030.215,8.562,10.000,0.000},
				{2030.878,6.627,10.000,0.000},
				{2031.363,4.846,10.000,0.000},
				{2031.697,3.344,10.000,0.000},
				{2031.909,2.121,10.000,0.000},
				{2032.027,1.177,10.000,0.000},
				{2032.078,0.511,10.000,0.000},
				{2032.090,0.124,10.000,0.000},
				{2032.090,0.000,10.000,0.000}		};

}