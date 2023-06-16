package com.petwaregames.bbw.base;

import java.util.HashMap;

/**
 * An Interaction is a list of name/value pairs
 *
 * The name describes which attribute of an object should
 * be affected, e.g., "strength", "speed", "happiness", etc.
 *
 * The value provides a (usually numeric) value that is used
 * to adjust the attribute, e.g., Integer.valueOf(-1)
 */

// Possible names in returned Interaction = "sleepiness", "happiness", "points"
// All take an integer value

// Possible names in fromPlayer Interaction = "action"
// Value is a String that represents a way of interacting
// Possible values are "touch", "sniff", "taste", "eat"

// Possible names for all interaction
// "name"  - String Value is the name of the interacting token
// "description" - String Value describes the nature of th einteraction

public class Interaction extends HashMap<String, Object> {


}
