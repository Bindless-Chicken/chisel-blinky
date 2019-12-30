module blinky_top
(
  input i_clk,
  input i_rst,

  output o_led
);
  Blinky b(
    .clock(i_clk),
    .reset(~i_rst),

    .io_led(o_led)
  );
endmodule
