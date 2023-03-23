package com.localcc.armorhide.mixin;

import com.localcc.armorhide.ServerMod;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.createS2CPacket;

@Mixin(ServerPlayNetworking.class)
public class ServerPlayNetworkingMixin {
    @Inject(method = "send", at = @At("HEAD"), cancellable = true)
    private static void send(ServerPlayer player, ResourceLocation channelName, FriendlyByteBuf buf, CallbackInfo ci) {
        
    }
}
