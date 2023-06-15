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

// Possible names to send to player = "sleepiness", "happiness", "points"
// All take an integer value

// Possible names fromPlayer = "consume"
// Value is integer represents a percentage
// Possible names for any interaction
// "name"
// "description"

public class Interaction extends HashMap<String, Object> {


}
