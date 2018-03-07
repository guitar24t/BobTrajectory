package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideScalePart2 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (0.86,0.00,0.00)
	
	public SameSideScalePart2() {
		this(false);
	}
			
    public SameSideScalePart2(boolean flipped) {
		super();
		
		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

		double[][] leftPoints = {
				{0.014,0.273,10.000,0.000},
				{0.068,0.546,10.000,0.000},
				{0.191,1.228,10.000,0.000},
				{0.409,2.183,10.000,0.000},
				{0.751,3.412,10.000,0.000},
				{1.242,4.913,10.000,0.000},
				{1.910,6.687,10.000,0.000},
				{2.770,8.597,10.000,0.000},
				{3.821,10.508,10.000,0.000},
				{5.063,12.418,10.000,0.000},
				{6.496,14.329,10.000,0.000},
				{8.120,16.239,10.000,0.000},
				{9.935,18.150,10.000,0.000},
				{11.941,20.060,10.000,0.000},
				{14.138,21.971,10.000,0.000},
				{16.526,23.881,10.000,0.000},
				{19.105,25.792,10.000,0.000},
				{21.875,27.702,10.000,0.000},
				{24.836,29.613,10.000,0.000},
				{27.989,31.523,10.000,0.000},
				{31.332,33.434,10.000,0.000},
				{34.867,35.344,10.000,0.000},
				{38.592,37.255,10.000,0.000},
				{42.509,39.165,10.000,0.000},
				{46.616,41.076,10.000,0.000},
				{50.915,42.986,10.000,0.000},
				{55.404,44.897,10.000,0.000},
				{60.085,46.807,10.000,0.000},
				{64.957,48.718,10.000,0.000},
				{70.020,50.628,10.000,0.000},
				{75.274,52.539,10.000,0.000},
				{80.719,54.449,10.000,0.000},
				{86.355,56.360,10.000,0.000},
				{92.182,58.270,10.000,0.000},
				{98.200,60.181,10.000,0.000},
				{104.409,62.091,10.000,0.000},
				{110.809,64.002,10.000,0.000},
				{117.400,65.912,10.000,0.000},
				{124.182,67.823,10.000,0.000},
				{131.156,69.733,10.000,0.000},
				{138.320,71.644,10.000,0.000},
				{145.676,73.554,10.000,0.000},
				{153.222,75.465,10.000,0.000},
				{160.960,77.375,10.000,0.000},
				{168.875,79.149,10.000,0.000},
				{176.940,80.650,10.000,0.000},
				{185.127,81.879,10.000,0.000},
				{193.411,82.834,10.000,0.000},
				{201.762,83.516,10.000,0.000},
				{210.152,83.892,10.000,0.000},
				{218.534,83.826,10.000,0.000},
				{226.869,83.351,10.000,0.000},
				{235.130,82.602,10.000,0.000},
				{243.288,81.581,10.000,0.000},
				{251.316,80.286,10.000,0.000},
				{259.188,78.719,10.000,0.000},
				{266.879,76.912,10.000,0.000},
				{274.380,75.002,10.000,0.000},
				{281.689,73.091,10.000,0.000},
				{288.807,71.181,10.000,0.000},
				{295.734,69.270,10.000,0.000},
				{302.470,67.360,10.000,0.000},
				{309.015,65.449,10.000,0.000},
				{315.368,63.539,10.000,0.000},
				{321.531,61.628,10.000,0.000},
				{327.503,59.718,10.000,0.000},
				{333.284,57.807,10.000,0.000},
				{338.873,55.897,10.000,0.000},
				{344.272,53.986,10.000,0.000},
				{349.480,52.076,10.000,0.000},
				{354.496,50.165,10.000,0.000},
				{359.322,48.255,10.000,0.000},
				{363.956,46.344,10.000,0.000},
				{368.399,44.434,10.000,0.000},
				{372.652,42.523,10.000,0.000},
				{376.713,40.613,10.000,0.000},
				{380.583,38.702,10.000,0.000},
				{384.262,36.792,10.000,0.000},
				{387.750,34.881,10.000,0.000},
				{391.047,32.971,10.000,0.000},
				{394.153,31.060,10.000,0.000},
				{397.068,29.150,10.000,0.000},
				{399.792,27.239,10.000,0.000},
				{402.325,25.329,10.000,0.000},
				{404.667,23.418,10.000,0.000},
				{406.818,21.508,10.000,0.000},
				{408.777,19.597,10.000,0.000},
				{410.546,17.687,10.000,0.000},
				{412.124,15.776,10.000,0.000},
				{413.510,13.866,10.000,0.000},
				{414.706,11.955,10.000,0.000},
				{415.710,10.045,10.000,0.000},
				{416.524,8.134,10.000,0.000},
				{417.149,6.257,10.000,0.000},
				{417.604,4.549,10.000,0.000},
				{417.915,3.114,10.000,0.000},
				{418.111,1.952,10.000,0.000},
				{418.217,1.063,10.000,0.000},
				{418.262,0.447,10.000,0.000},
				{418.272,0.103,10.000,0.000},
				{418.272,0.000,10.000,0.000}
		};
		
		double[][] rightPoints = {
				{-0.014,-0.273,10.000,0.000},
				{-0.068,-0.546,10.000,0.000},
				{-0.191,-1.228,10.000,0.000},
				{-0.409,-2.183,10.000,0.000},
				{-0.751,-3.412,10.000,0.000},
				{-1.242,-4.913,10.000,0.000},
				{-1.910,-6.687,10.000,0.000},
				{-2.770,-8.597,10.000,0.000},
				{-3.821,-10.508,10.000,0.000},
				{-5.063,-12.418,10.000,0.000},
				{-6.496,-14.329,10.000,0.000},
				{-8.120,-16.239,10.000,0.000},
				{-9.935,-18.150,10.000,0.000},
				{-11.941,-20.060,10.000,0.000},
				{-14.138,-21.971,10.000,0.000},
				{-16.526,-23.881,10.000,0.000},
				{-19.105,-25.792,10.000,0.000},
				{-21.875,-27.702,10.000,0.000},
				{-24.836,-29.613,10.000,0.000},
				{-27.989,-31.523,10.000,0.000},
				{-31.332,-33.434,10.000,0.000},
				{-34.867,-35.344,10.000,0.000},
				{-38.592,-37.255,10.000,0.000},
				{-42.509,-39.165,10.000,0.000},
				{-46.616,-41.076,10.000,0.000},
				{-50.915,-42.986,10.000,0.000},
				{-55.404,-44.897,10.000,0.000},
				{-60.085,-46.807,10.000,0.000},
				{-64.957,-48.718,10.000,0.000},
				{-70.020,-50.628,10.000,0.000},
				{-75.274,-52.539,10.000,0.000},
				{-80.719,-54.449,10.000,0.000},
				{-86.355,-56.360,10.000,0.000},
				{-92.182,-58.270,10.000,0.000},
				{-98.200,-60.181,10.000,0.000},
				{-104.409,-62.091,10.000,0.000},
				{-110.809,-64.002,10.000,0.000},
				{-117.400,-65.912,10.000,0.000},
				{-124.182,-67.823,10.000,0.000},
				{-131.156,-69.733,10.000,0.000},
				{-138.320,-71.644,10.000,0.000},
				{-145.676,-73.554,10.000,0.000},
				{-153.222,-75.465,10.000,0.000},
				{-160.960,-77.375,10.000,0.000},
				{-168.875,-79.149,10.000,0.000},
				{-176.940,-80.650,10.000,0.000},
				{-185.127,-81.879,10.000,0.000},
				{-193.411,-82.834,10.000,0.000},
				{-201.762,-83.516,10.000,0.000},
				{-210.152,-83.892,10.000,0.000},
				{-218.534,-83.826,10.000,0.000},
				{-226.869,-83.351,10.000,0.000},
				{-235.130,-82.602,10.000,0.000},
				{-243.288,-81.581,10.000,0.000},
				{-251.316,-80.286,10.000,0.000},
				{-259.188,-78.719,10.000,0.000},
				{-266.879,-76.912,10.000,0.000},
				{-274.380,-75.002,10.000,0.000},
				{-281.689,-73.091,10.000,0.000},
				{-288.807,-71.181,10.000,0.000},
				{-295.734,-69.270,10.000,0.000},
				{-302.470,-67.360,10.000,0.000},
				{-309.015,-65.449,10.000,0.000},
				{-315.368,-63.539,10.000,0.000},
				{-321.531,-61.628,10.000,0.000},
				{-327.503,-59.718,10.000,0.000},
				{-333.284,-57.807,10.000,0.000},
				{-338.873,-55.897,10.000,0.000},
				{-344.272,-53.986,10.000,0.000},
				{-349.480,-52.076,10.000,0.000},
				{-354.496,-50.165,10.000,0.000},
				{-359.322,-48.255,10.000,0.000},
				{-363.956,-46.344,10.000,0.000},
				{-368.399,-44.434,10.000,0.000},
				{-372.652,-42.523,10.000,0.000},
				{-376.713,-40.613,10.000,0.000},
				{-380.583,-38.702,10.000,0.000},
				{-384.262,-36.792,10.000,0.000},
				{-387.750,-34.881,10.000,0.000},
				{-391.047,-32.971,10.000,0.000},
				{-394.153,-31.060,10.000,0.000},
				{-397.068,-29.150,10.000,0.000},
				{-399.792,-27.239,10.000,0.000},
				{-402.325,-25.329,10.000,0.000},
				{-404.667,-23.418,10.000,0.000},
				{-406.818,-21.508,10.000,0.000},
				{-408.777,-19.597,10.000,0.000},
				{-410.546,-17.687,10.000,0.000},
				{-412.124,-15.776,10.000,0.000},
				{-413.510,-13.866,10.000,0.000},
				{-414.706,-11.955,10.000,0.000},
				{-415.710,-10.045,10.000,0.000},
				{-416.524,-8.134,10.000,0.000},
				{-417.149,-6.257,10.000,0.000},
				{-417.604,-4.549,10.000,0.000},
				{-417.915,-3.114,10.000,0.000},
				{-418.111,-1.952,10.000,0.000},
				{-418.217,-1.063,10.000,0.000},
				{-418.262,-0.447,10.000,0.000},
				{-418.272,-0.103,10.000,0.000},
				{-418.272,-0.000,10.000,0.000}
		};
		
		double[][] centerPoints = {
				{0.014,0.273,10.000,0.000},
				{0.068,0.546,10.000,0.000},
				{0.191,1.228,10.000,0.000},
				{0.409,2.183,10.000,0.000},
				{0.751,3.412,10.000,0.000},
				{1.242,4.913,10.000,0.000},
				{1.910,6.687,10.000,0.000},
				{2.770,8.597,10.000,0.000},
				{3.821,10.508,10.000,0.000},
				{5.063,12.418,10.000,0.000},
				{6.496,14.329,10.000,0.000},
				{8.120,16.239,10.000,0.000},
				{9.935,18.150,10.000,0.000},
				{11.941,20.060,10.000,0.000},
				{14.138,21.971,10.000,0.000},
				{16.526,23.881,10.000,0.000},
				{19.105,25.792,10.000,0.000},
				{21.875,27.702,10.000,0.000},
				{24.836,29.613,10.000,0.000},
				{27.989,31.523,10.000,0.000},
				{31.332,33.434,10.000,0.000},
				{34.867,35.344,10.000,0.000},
				{38.592,37.255,10.000,0.000},
				{42.509,39.165,10.000,0.000},
				{46.616,41.076,10.000,0.000},
				{50.915,42.986,10.000,0.000},
				{55.404,44.897,10.000,0.000},
				{60.085,46.807,10.000,0.000},
				{64.957,48.718,10.000,0.000},
				{70.020,50.628,10.000,0.000},
				{75.274,52.539,10.000,0.000},
				{80.719,54.449,10.000,0.000},
				{86.355,56.360,10.000,0.000},
				{92.182,58.270,10.000,0.000},
				{98.200,60.181,10.000,0.000},
				{104.409,62.091,10.000,0.000},
				{110.809,64.002,10.000,0.000},
				{117.400,65.912,10.000,0.000},
				{124.182,67.823,10.000,0.000},
				{131.156,69.733,10.000,0.000},
				{138.320,71.644,10.000,0.000},
				{145.676,73.554,10.000,0.000},
				{153.222,75.465,10.000,0.000},
				{160.960,77.375,10.000,0.000},
				{168.875,79.149,10.000,0.000},
				{176.940,80.650,10.000,0.000},
				{185.127,81.879,10.000,0.000},
				{193.411,82.834,10.000,0.000},
				{201.762,83.516,10.000,0.000},
				{210.152,83.892,10.000,0.000},
				{218.534,83.826,10.000,0.000},
				{226.869,83.351,10.000,0.000},
				{235.130,82.602,10.000,0.000},
				{243.288,81.581,10.000,0.000},
				{251.316,80.286,10.000,0.000},
				{259.188,78.719,10.000,0.000},
				{266.879,76.912,10.000,0.000},
				{274.380,75.002,10.000,0.000},
				{281.689,73.091,10.000,0.000},
				{288.807,71.181,10.000,0.000},
				{295.734,69.270,10.000,0.000},
				{302.470,67.360,10.000,0.000},
				{309.015,65.449,10.000,0.000},
				{315.368,63.539,10.000,0.000},
				{321.531,61.628,10.000,0.000},
				{327.503,59.718,10.000,0.000},
				{333.284,57.807,10.000,0.000},
				{338.873,55.897,10.000,0.000},
				{344.272,53.986,10.000,0.000},
				{349.480,52.076,10.000,0.000},
				{354.496,50.165,10.000,0.000},
				{359.322,48.255,10.000,0.000},
				{363.956,46.344,10.000,0.000},
				{368.399,44.434,10.000,0.000},
				{372.652,42.523,10.000,0.000},
				{376.713,40.613,10.000,0.000},
				{380.583,38.702,10.000,0.000},
				{384.262,36.792,10.000,0.000},
				{387.750,34.881,10.000,0.000},
				{391.047,32.971,10.000,0.000},
				{394.153,31.060,10.000,0.000},
				{397.068,29.150,10.000,0.000},
				{399.792,27.239,10.000,0.000},
				{402.325,25.329,10.000,0.000},
				{404.667,23.418,10.000,0.000},
				{406.818,21.508,10.000,0.000},
				{408.777,19.597,10.000,0.000},
				{410.546,17.687,10.000,0.000},
				{412.124,15.776,10.000,0.000},
				{413.510,13.866,10.000,0.000},
				{414.706,11.955,10.000,0.000},
				{415.710,10.045,10.000,0.000},
				{416.524,8.134,10.000,0.000},
				{417.149,6.257,10.000,0.000},
				{417.604,4.549,10.000,0.000},
				{417.915,3.114,10.000,0.000},
				{418.111,1.952,10.000,0.000},
				{418.217,1.063,10.000,0.000},
				{418.262,0.447,10.000,0.000},
				{418.272,0.103,10.000,0.000},
				{418.272,0.000,10.000,0.000}		};

}