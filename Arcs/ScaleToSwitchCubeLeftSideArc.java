package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class ScaleToSwitchCubeLeftSideArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (24.13,19.15,-15.00)
	// (19.13,20.15,5.00)
	
    public ScaleToSwitchCubeLeftSideArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public ScaleToSwitchCubeLeftSideArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.445,8.895,10.000,0.000},
				{2.224,26.684,10.000,-0.000},
				{6.226,53.367,10.000,-0.000},
				{13.342,88.945,10.000,-0.000},
				{24.460,133.418,10.000,-0.000},
				{40.470,186.785,10.000,-0.000},
				{62.262,249.046,10.000,-0.000},
				{90.724,320.202,10.000,-0.000},
				{126.747,400.253,10.000,-0.000},
				{171.219,489.198,10.000,-0.001},
				{225.031,587.037,10.000,-0.001},
				{289.071,693.771,10.000,-0.002},
				{364.230,809.400,10.000,-0.003},
				{451.396,933.923,10.000,-0.005},
				{551.459,1067.341,10.000,-0.007},
				{665.309,1209.653,10.000,-0.010},
				{793.835,1360.859,10.000,-0.014},
				{937.926,1520.960,10.000,-0.020},
				{1098.471,1689.956,10.000,-0.027},
				{1276.361,1867.846,10.000,-0.036},
				{1472.041,2045.736,10.000,-0.048},
				{1685.509,2223.626,10.000,-0.063},
				{1916.766,2401.516,10.000,-0.080},
				{2165.812,2579.406,10.000,-0.102},
				{2432.647,2757.297,10.000,-0.127},
				{2717.271,2935.187,10.000,-0.157},
				{3019.684,3113.077,10.000,-0.191},
				{3339.887,3290.967,10.000,-0.231},
				{3677.878,3468.857,10.000,-0.277},
				{4033.658,3646.747,10.000,-0.329},
				{4407.227,3824.637,10.000,-0.387},
				{4798.586,4002.527,10.000,-0.452},
				{5207.733,4180.417,10.000,-0.524},
				{5634.669,4358.308,10.000,-0.603},
				{6079.394,4536.198,10.000,-0.690},
				{6541.909,4714.088,10.000,-0.785},
				{7022.212,4891.978,10.000,-0.887},
				{7520.304,5069.868,10.000,-0.997},
				{8036.185,5247.758,10.000,-1.114},
				{8569.856,5425.648,10.000,-1.239},
				{9121.315,5603.538,10.000,-1.371},
				{9690.563,5781.428,10.000,-1.510},
				{10277.601,5959.318,10.000,-1.656},
				{10882.427,6137.209,10.000,-1.808},
				{11505.042,6315.099,10.000,-1.964},
				{12145.447,6492.989,10.000,-2.126},
				{12803.640,6670.879,10.000,-2.291},
				{13479.623,6848.769,10.000,-2.459},
				{14173.394,7026.659,10.000,-2.629},
				{14884.954,7204.549,10.000,-2.800},
				{15613.859,7373.545,10.000,-2.969},
				{16359.219,7533.646,10.000,-3.136},
				{17120.143,7684.852,10.000,-3.299},
				{17895.744,7827.165,10.000,-3.457},
				{18685.132,7960.582,10.000,-3.607},
				{19487.416,8085.105,10.000,-3.747},
				{20301.708,8200.734,10.000,-3.877},
				{21127.118,8307.468,10.000,-3.994},
				{21962.757,8405.307,10.000,-4.096},
				{22807.735,8494.252,10.000,-4.183},
				{23661.163,8574.303,10.000,-4.252},
				{24522.151,8645.459,10.000,-4.301},
				{25389.810,8707.721,10.000,-4.330},
				{26263.250,8761.088,10.000,-4.338},
				{27141.582,8805.560,10.000,-4.322},
				{28023.917,8841.138,10.000,-4.282},
				{28909.365,8867.822,10.000,-4.218},
				{29797.037,8885.611,10.000,-4.128},
				{30686.043,8894.505,10.000,-4.012},
				{31575.493,8894.505,10.000,-3.869},
				{32464.944,8894.505,10.000,-3.699},
				{33354.394,8894.505,10.000,-3.502},
				{34243.845,8894.505,10.000,-3.278},
				{35133.295,8894.505,10.000,-3.026},
				{36022.746,8894.505,10.000,-2.746},
				{36912.196,8894.505,10.000,-2.439},
				{37801.647,8894.505,10.000,-2.104},
				{38691.097,8894.505,10.000,-1.742},
				{39580.548,8894.505,10.000,-1.353},
				{40469.998,8894.505,10.000,-0.937},
				{41359.449,8894.505,10.000,-0.495},
				{42248.899,8894.505,10.000,-0.028},
				{43138.350,8894.505,10.000,0.465},
				{44027.800,8894.505,10.000,0.981},
				{44917.251,8894.505,10.000,1.520},
				{45806.643,8893.336,10.000,2.082},
				{46695.473,8883.272,10.000,2.663},
				{47582.853,8864.314,10.000,3.263},
				{48467.891,8836.461,10.000,3.879},
				{49349.700,8799.713,10.000,4.508},
				{50227.389,8754.071,10.000,5.149},
				{51100.070,8699.535,10.000,5.798},
				{51966.852,8636.104,10.000,6.454},
				{52826.846,8563.779,10.000,7.112},
				{53679.163,8482.559,10.000,7.770},
				{54522.913,8392.444,10.000,8.426},
				{55357.207,8293.435,10.000,9.076},
				{56181.155,8185.532,10.000,9.718},
				{56993.868,8068.734,10.000,10.349},
				{57794.457,7943.042,10.000,10.968},
				{58582.032,7808.455,10.000,11.570},
				{59355.703,7664.973,10.000,12.155},
				{60114.582,7512.597,10.000,12.721},
				{60857.778,7351.327,10.000,13.266},
				{61584.402,7181.162,10.000,13.787},
				{62293.624,7003.272,10.000,14.285},
				{62985.057,6825.382,10.000,14.759},
				{63658.700,6647.491,10.000,15.208},
				{64314.555,6469.601,10.000,15.632},
				{64952.621,6291.711,10.000,16.032},
				{65572.897,6113.821,10.000,16.407},
				{66175.385,5935.931,10.000,16.758},
				{66760.084,5758.041,10.000,17.086},
				{67326.993,5580.151,10.000,17.390},
				{67876.114,5402.261,10.000,17.673},
				{68407.445,5224.371,10.000,17.933},
				{68920.988,5046.481,10.000,18.173},
				{69416.741,4868.590,10.000,18.392},
				{69894.706,4690.700,10.000,18.592},
				{70354.881,4512.810,10.000,18.774},
				{70797.268,4334.920,10.000,18.938},
				{71221.865,4157.030,10.000,19.086},
				{71628.674,3979.140,10.000,19.218},
				{72017.693,3801.250,10.000,19.336},
				{72388.924,3623.360,10.000,19.440},
				{72742.365,3445.470,10.000,19.532},
				{73078.018,3267.579,10.000,19.612},
				{73395.881,3089.689,10.000,19.681},
				{73695.956,2911.799,10.000,19.740},
				{73978.241,2733.909,10.000,19.791},
				{74242.738,2556.019,10.000,19.834},
				{74489.445,2378.129,10.000,19.869},
				{74718.363,2200.239,10.000,19.899},
				{74929.493,2022.349,10.000,19.922},
				{75122.833,1844.459,10.000,19.942},
				{75298.443,1667.738,10.000,19.957},
				{75456.825,1499.912,10.000,19.968},
				{75598.870,1340.980,10.000,19.977},
				{75725.466,1190.943,10.000,19.984},
				{75837.503,1049.800,10.000,19.989},
				{75935.871,917.552,10.000,19.993},
				{76021.458,794.198,10.000,19.995},
				{76095.155,679.739,10.000,19.997},
				{76157.851,574.174,10.000,19.998},
				{76210.435,477.504,10.000,19.999},
				{76253.796,389.728,10.000,19.999},
				{76288.825,310.847,10.000,20.000},
				{76316.411,240.861,10.000,20.000},
				{76337.442,179.768,10.000,20.000},
				{76352.809,127.571,10.000,20.000},
				{76363.401,84.268,10.000,20.000},
				{76370.107,49.859,10.000,20.000},
				{76373.817,24.345,10.000,20.000},
				{76375.421,7.725,10.000,20.000},
				{76375.807,0.000,10.000,20.000},
				{76375.807,0.000,10.000,20.000}		};

}