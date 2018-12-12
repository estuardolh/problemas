class Claim
  def initialize(id, x, y, width, height)
    @id = id
    @x = x
    @y = y
    @width = width
    @height = height
  end
  
  def print_me()
    puts "#{@id} @ #{@x},#{@y}: #{@width}x#{@height}"
  end

  def overlap(a_claim)
    return [0]
end

FABRIC_SIDE = 1000

claim = Claim.new("#1", 1, 3, 4, 4)
claim.print_me()

input = ARGF.read

input.split("\n").each do |note|
  list_at = note.split("@")
  list_colon = list_at[1].split(":")

  id = list_at[0]
  list_pos = list_colon[0].split(",")

  x = Integer(list_pos[0])
  y = Integer(list_pos[1])

  list_size = list_colon[1].split("x")
  
  width = Integer(list_size[0])
  height = Integer(list_size[1])
  
  puts "#{id}--#{x}-#{y}--#{width}--#{height}"
end

exit(0)
