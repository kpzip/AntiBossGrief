FileWriter out = null;
        try {
        	out = new FileWriter("output.txt");
        	
        	
        	for (Block block : Registries.BLOCK) {
            	String str = block.getName().toString();
            	str = str.substring(33, str.length()-11);
            	out.write("\t\t\"minecraft:" + str + "\",\n");
            }
        	out.close();
        } catch (IOException e) {
			e.printStackTrace();
		} finally {
        	
        }
