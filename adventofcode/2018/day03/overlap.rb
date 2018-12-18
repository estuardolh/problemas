class Claim
  def initialize(id, x, y, width, height)
    @id = id
    @x = x
    @y = y
    @width = width
    @height = height
  end
  
  def getId()
    return @id
  end
  
  def print_me()
    puts "#{@id}|#{@x},#{@y}|#{@width}x#{@height}"
  end
  
  def into(x, y)
    if(x >= @x and x < (@x+@width) and y >= @y and y < (@y+@height))then
      return true
    else
      return false
    end
  end
end

FABRIC_SIDE_SIZE = 1000

area_overlaped = 0
claims = Array.new

#
# load Claims
#
input = ARGF.read
input.split("\n").each do |note|
  list_at = note.split("@")
  list_colon = list_at[1].split(":")
  
  id = list_at[0].strip
  list_pos = list_colon[0].split(",")
  
  x = Integer(list_pos[0])
  y = Integer(list_pos[1])
  
  list_size = list_colon[1].split("x")
  
  width = Integer(list_size[0])
  height = Integer(list_size[1])
  
  a_claim = Claim.new(id,x,y,width,height)
  claims.push(a_claim)
  #a_claim.print_me()
end

#
# iterate Claims area
#
matches = 0
# go from 0 to FABRIC_SIDE_SIZE in X axis
for i in 0..FABRIC_SIDE_SIZE
  # go from 0 to FABRIC_SIDE_SIZE in Y axis
  for j in 0..FABRIC_SIDE_SIZE
    # search in Claims until get 2 of them
    claims.each do |claim|
      if(claim.into(i,j) == true)then
        matches+=1
        #puts "found in #{i},#{j} || #{claim.getId()}"
        if(matches == 2)then
          matches=0
          area_overlaped+=1
          break
        end
      end
    end
    if(matches == 1)then
      matches=0
    end
  end
end

puts "Area overlaped = #{area_overlaped}"
