String direction = "";
float yaw = player.getLocation().getYaw();
if (yaw < 0) yaw += 360;
if (yaw >= 315 || yaw < 45){
  direction = "SOUTH";
}
else if (yaw < 135){
  direction = "WEST";
}
else if (yaw < 225){
  direction = "NORTH";
}
else if (yaw < 315) {
  direction = "EAST";
}
System.out.println("Direction: " + direction");
