import pygame
import sys
from pygame import *
from pygame import display

pygame.init()

screen = pygame.display.set_mode((800, 600))

pygame.display.set_caption("Zombie Defense")
icon = pygame.image.load("zombie.png")
pygame.display.set_icon(icon)
aceptar = Rect(100,100,150,50)
while True:
    screen.fill((255, 255, 255))
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            sys.exit()
    draw.rect(screen,(79,44,24),aceptar,0)
    display.flip()
