package soot.jimple.infoflow.android.shoon.utils;

import java.util.HashMap;
import java.util.List;

import soot.SootMethod;
import soot.Unit;

public class CoarsePathsProducer {
	private static CoarsePathsProducer instance = new CoarsePathsProducer();
	
	private CoarsePathsProducer(){};
	
	public static CoarsePathsProducer v(){
		return instance;
	}
	
	/**
	 * Get the potential paths from sources to sinks
	 * @param sources : the found sources
	 * @param sinks : the found sinks
	 */
	public void getCoarsePathsFromSourcesToSinks(HashMap<SootMethod, List<Unit>> sources, HashMap<SootMethod, List<Unit>> sinks){
		
	}
}
